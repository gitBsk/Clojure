(ns fwpd.core)
(def filename "suspects.csv")

(defn -main [])

(def vamp-keys [:name :glitter-index])

(defn str->int  [str]  (Integer. str))

(def conversions {:name identity :glitter-index str->int})

(defn convert  [vamp-key value]  ((get conversions vamp-key) value))

(defn parse  "Convert a CSV into rows of columns"  [string]  (map #(clojure.string/split % #",")       (clojure.string/split string #"\n")))

(defn mapify  "Return a seq of maps like {:name \"Edward Cullen\" :glitter-index 10}"
[rows]  (map (fn [unmapped-row]
         (reduce (fn [row-map [vamp-key value]]
		 (assoc row-map vamp-key (convert vamp-key value)))
		 {}                 (map vector vamp-keys unmapped-row)))       rows))

(defn glitter-filter  [minimum-glitter records]
	 (filter #(>= (:glitter-index %) minimum-glitter) records))

;Solution to Ex 1
(defn glitter-names [minimum-glitter records]
     	 (map :name (filter #(>= (:glitter-index %) minimum-glitter) records)))

;Solution to Ex 2
(defn append1
         [suspects-list name glitter]
         (conj suspects-list (into {} {:name name :glitter-index glitter})))

;Solutions to Ex 3
;here map = the output of glitter-filter 
(defn validatekeys [map keywords] (if(contains? map keywords)(println "Validated")))

;Soltuion to Ex 4
(clojure.string/join "," (vals glitter-filter))



;(first (mapify (parse (slurp filename))))
;(glitter-names 3 (mapify (parse (slurp filename))))
