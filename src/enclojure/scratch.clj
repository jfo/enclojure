(ns enclojure.scratch)

(def x '(1 2 3 4 5 6 7))


(defn anotherrev [alist]
  (loop [thing alist
         acc '()]
   (if (= (count thing) 0)
     acc
     (recur (rest thing) (conj acc (first thing)))
    )
  )
)

(defn otherrev
  ([a] (otherrev a '() ) )
  ([thing acc]
   (if (= (count thing) 0)
     acc
     (otherrev (rest thing) (conj acc (first thing)))
    )
  )
)


(defn rev_recur_to_fn [alist]
  (let [tester (fn  [thing acc]
   (if (= (count thing) 0)
     acc
     (recur (rest thing) (conj acc (first thing)))))]
    (tester alist '() )
    )
)


; (defn rev_tail_call [alist]
;   (let [aaa (fn tester [thing acc]
;    (if (= (count thing) 0)
;      acc
;      (tester (rest thing) (conj acc (first thing)))))]
;     (tester alist '() )
;     )
; )

(otherrev x)
(anotherrev x)
(rev_recur_to_fn x)
; (rev_tail_call x)

