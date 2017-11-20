(ns koans.04-vectors
  (:require [koan-engine.core :refer :all]))

(meditations
  "You can use vectors in clojure as array-like structures"
  (= __ (count [42]))

  "You can create a vector from elements"
  (= __ (vector nil nil))

  "Conjoining to a vector is easy"
  (= __ (conj [111 222] 333))

  "You can get the first element of a vector like so"
  (= __ (first [:peanut :butter :and :jelly]))

  "And the last in a similar fashion"
  (= __ (last [:peanut :butter :and :jelly]))

  "Or any index if you wish"
  (= __ (nth [:peanut :butter :and :jelly] 3))

  "You can also slice a vector"
  (= __ (subvec [:peanut :butter :and :jelly] 1 3)))