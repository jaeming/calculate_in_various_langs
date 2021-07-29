(ns calculator.core)

(defn -main [& args]
  (println "Enter number to be operated on:")
  (def num1 (read-string (read-line)))
  (println "Enter operator:")
  (def operator (read-line))
  (println "Enter number to operate by:")
  (def num2 (read-string (read-line)))

  (def answer (case operator
                "+" (+ num1 num2)
                "-" (- num1 num2)
                "*" (* num1 num2)
                "/" (/ num1 num2)
              )
  )

  (println (str "The answer is \"" answer "\"")))
