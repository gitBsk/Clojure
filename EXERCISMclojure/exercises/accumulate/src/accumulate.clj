(ns accumulate)
:
(defn accumulate [func coll]
      (loop [tempcoll coll
             finalcoll []]
            (if (empty? tempcoll)
                  finalcoll
                  (recur (rest tempcoll) (conj finalcoll (func (first tempcoll)))))))