(ns chapter5.core
  (:gen-class))

;Solution to Ex 1
  (defn attr
    "Takes a keyword to be looked up"
    [kw]
    (comp (kw (get-in character [:attributes]))))

    ;Sample i/o user=> (attr :intelligence)
    ;10


;Solution to Ex 2
