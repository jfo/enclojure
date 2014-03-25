(ns enclojure.scratch2)

(type {})

(def x {})

(eval x)

(def x (assoc x :derp 34))

(def fullname ["guy" "lewis" "steele"])

(str (nth fullname 2) ", "
     (nth fullname 0) " "
     (nth fullname 1))

(range 5)
(range 5)

(defn xors [max-x max-y] 
  (for [x (range max-x) y (range max-y)] [x y (bit-xor x y)]))

; (doseq [[x y xor] (xors 200 200)]
;   (.setColor gfx (java.awt.Color.  234 38 xor))
;   (.fillRect gfx x y 1 1))




; (for [x (range 2) y (range 2)] [x y])
; (for [x (range 2) y (range 2)] [x y ( bit-xor x y )])


; (bit-xor x y)
; (xors 255 255 )

; (def frame (java.awt.Frame.))
; (println frame)
; (type frame)



(defn calc [op1 oper op2 & args]
  (let [args (flatten args)]
    (if (= (count args) 0)
          (oper op1 op2)
          (calc (oper op1 op2) (nth args 0) (nth args 1) (subvec (vec args) 2)))))

(println (calc 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))

(subvec [1 2 3 4 5 6] 3)
(subvec [1 2 3 4 5 6] 3)
