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

;DataMap to be tested
(def users {:name "James" :age 26})

;Solution to Ex 3
(defn bala-assoc
"Implement assoc in function"
[m k v]
(assoc m k v)
)

;Sample : (bala-assoc users :name "Superman")

(def emps {:id 1 :position {:manager "yes" :normal "no"}})

(defn bala-assoc-in
"Implement assoc in function"
[m [k & kws] v]
(assoc m k (bala-assoc-in (get m k) kws v)
))


;(bala-assoc-in emps [:position :manager] "superman")

;Ex 4
;Using update-in function
;user=> heros
;{:name "superman", :powers {:speed 10, :strength 20}}
;user=> (update-in heros [:powers :speed] + 100)
;{:name "superman", :powers {:speed 110, :strength 20}}

;Ex 5

(def heros {:name "superman", :powers {:speed 10, :strength 20}})

(defn bala-update-in
  "Implement update-in"
  [m [k & kws] func & args]
  (assoc m k (apply bala-update-in (get m k) kws func args))
  )

  (bala-update-in heros [:powers :speed] + 1000)
