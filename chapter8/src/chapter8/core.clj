(ns chapter8.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defmacro my-first-macro
  "Trying to use syntax quoting"
  [x y]
  `(println "Printing Y" '~y)
  )

  ;(my-first-macro 2 5)

  (defmacro when-valid
     "Similar to if-valid"
     [to-validate validations & body]
     `(let [errors# (validate ~to-validate ~validations)]
       (if (empty? errors#)
         (do
           ~@body)))
     )

  (defmacro or
    "Implement the or macro"
    ([] true)
    ([x] x)
    ([x & next]
     `(let [or# ~x]
        (if or# or# (or ~@next))))
  )


  (defmacro defattrs
   "Implement solution for ex 3"
   ([func attr]
    `(def ~func (comp ~attr :attributes))
   )
