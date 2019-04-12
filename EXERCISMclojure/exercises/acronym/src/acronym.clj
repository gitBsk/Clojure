(ns acronym
  (:require [clojure.string :as str]))

(defn acronym [acstr]
      (def convstr (str/split acstr #" "))
      (clojure.string/upper-case (str/join (map first convstr))))

(defn -main
      "I don't do a whole lot...yet." [& args]
      (println (acronym "Bala is")))













