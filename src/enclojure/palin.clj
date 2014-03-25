; ; Write a function which returns true if the given sequence is a palindrome.

; ; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)


; (defn palin [x]
;   (if (= (seq x) (reverse x))
;          true
;          false
;     )
;   )

; (false? (palin '(1 2 3 4 5)))
; (true? (palin "racecar"))
; (true? (palin [:foo :bar :foo]))

;  str (reverse "racecar"))




(defn lower [note]
  (if (< note 20.0)
    note
    (lower (/ note 2))))

(defn equaltemp [a acc]
      (if (> a 20000.0)
        acc
        (equaltemp (* a (Math/pow 2.0 (/ 1.0 12.0))) (cons a acc))))


(reverse (equaltemp (lower 437.0) (list)))

