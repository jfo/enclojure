(ns enclojure.stuart)

(+ 1 1)

(def derp 4)
(println derp)
(derp)

(def derpfunc (fn [] 4))
(type derpfunc)

(defn derpfunc2 [] 4)
(derpfunc2)

(def,,,,,,,,,,,,,,,,,,,,,,,,,,, derpfunc3 (fn[x] x))
(derpfunc3 4)


(def mapp {"derp", "derp"
          :dorp 5})

(type mapp)
(println mapp)

(mapp "derp")
(mapp :dorp)
(:dorp mapp)
("derp" mapp)


(defn sum [myvec acc]
    (if (= myvec [])
      acc
      (sum (rest myvec) (+ acc (first myvec)))))

(sum [1 2 3 4 5] 0)


(defn sum [myvec]
  (loop [invec myvec acc 0]
    (if (= invec [])
      acc
      (recur (rest invec) (+ acc (first invec))))))


(sum [1 2 3 4 5])


(first [1 2 3 4 5])


(= '(3) [3])

(vec (set [3 3 4 4 5]))

(eval #{3 5 4})

(type '())
(type [])
[]
{}
#{}



(defn derpfunc4 [] #())
(derpfunc4)

(4)
(quote (4))
'(4)

()
#()

{}
#{}

""
(#"")

(defn pip [x] x)

(pip 4)
(pip (#(pip %) 4))

(type #"")

((fn [x] x) 4)
(#(identity %) 4)
