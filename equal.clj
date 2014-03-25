(defn lower [note]
  (if (< note 20.0)
    note
    (lower (/ note 2))))

(defn equaltemp [a acc]
  (if (> a 20000.0)
    acc
    (equaltemp (* a (Math/pow 2.0 (/ 1.0 12.0))) (cons a acc))))

(reverse (equaltemp (lower 437.0) (list)))
