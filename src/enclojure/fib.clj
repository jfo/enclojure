(defn fib[n]
  (loop [x 0
         y 1
         n n
         out '()]
    (if (= 1 n)
      (reverse (conj out y ))
      (recur y (+ x y) (- n 1) (conj out y))
    ))
)


(fib 6)
(fib 8)
(fib 90)

(= (fib 6) '(1 1 2 3 5 8))
(= (fib 8) '(1 1 2 3 5 8 13 21))
(= (fib 3) '(1 1 2))
