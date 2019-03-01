(ns chapter3.core
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
;(#(println (str "the new number is: " (+ % 100))) 20) 

(defn dec-maker  
"Create a custom decrementor" 
[dec-by]
(println "===================== Question 3 ====================" )
#(- % dec-by)
)

(defn mapset 
"Functions like a map but returns a collection"
[func args]
(println "===================== Question 4 ====================" )
(println (str "The converted collection is :"(set (map func args))))
)



;Remove ; to execute questions
;================================

;Call for Question 1
;(question1)

;Call for Question 2
;(question2 56)

;Call for Question 3
;(def dec9 (dec-maker 9))
;(println (str "the number is " (dec9 10)))

;Call for Question 4
;(mapset inc [1 2 4 5 2 1 5 4 3 4 5 5 1 2])

