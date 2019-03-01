(ns chapter2.core
  (:gen-class))
  
(defn -main [])

(defn question1 []
	
	(println "===================== Question 1 ====================" )
	;Create Map
	(def empsalarymap {1 10000 2 2000 3 50000 :ceo 90000000})

	;Retrieve value from Map
	(println(get empsalarymap 1))
	
	;Retrieve value from Map [Treating it as a Function]
	(println(str "Map is called as Fucntion" " === " (empsalarymap 1)))
	
	;Retrieve value from Map [using Keyword as a function]
	(println(str "Salary of CEO" " === " (:ceo empsalarymap)))
	
	;Add element to Vector
	(println(str "Adding 4 to list [1 2 3]" " === " (conj [1 2 3] 4))) 
	
	;Creating Sets from vectors
	(println(str "removing duplicates from vector [1 2 3 3 1 5 6 7]" " === " (set [1 2 3 3 1 5 6 7])))
	
)

(defn question2 [num]

	(println "===================== Question 2 ====================" )
	(println (str "the new number is" ": " (+ num 100)))

)

;Alternate solution [shorter code] for question2
(#(println (str "the new number is: " (+ % 100))) 20) 



;(question1)
;(question2 56)




