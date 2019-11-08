(ns clojure1.core)

; define map
(def studentsMarks {"Inese" 10 "Vasja" 8 "Petja" 4 "Natasha" 7 "Anja" 10 "Lauris" 6 "Sandra" 8 "Krišjanis" 9})

; define list that holds filtered marks
(def listOfValues (vals (select-keys studentsMarks (for [[k v] studentsMarks :when (.endsWith k "a")] k))))

; calculate avg mark
(float (/ (reduce + listOfValues) (count listOfValues)))