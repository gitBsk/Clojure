(ns chapter5.core
  (:gen-class))

  (def character
                 {:name "Smooches McCutes"
                  :attributes {:intelligence 10
                               :strength 4
                             :dexterity 5}})

(defn -main [& args]
(println "Working!"))

;Solution to Ex 1
  (defn attr
    "Takes a keyword to be looked up"
    [kw]
    (comp (kw (get-in character [:attributes]))))

;Sample i/o user=> (attr :intelligence)
;10


;Solution to Ex 2
(defn bala-comp
"Implement Comp function"
[fn1 fn2]
(fn [& args]
(fn1 (reduce fn2 args))))

;Sample O/P => (println ((comp4 inc +) 2 3))
