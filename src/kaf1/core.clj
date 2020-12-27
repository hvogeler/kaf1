(ns kaf1.core
  (:require [clojure.core.async :as async :refer [chan thread poll! >!!]]
    [clojure.tools.logging :as log :refer :all])
  (:gen-class))

(defn from-kafka [chan]
  (loop [n 0]
    (Thread/sleep 1000)
    (logp :info (str (format "   msg - %d" n)))
    (if (not (poll! chan))
      (recur (inc n))
      (logp :info "   received stop signal on channel"))))

(defn run-it []
  (let [chan (chan)]
  (thread (from-kafka chan))
  (logp :info "main going to sleep")
  (Thread/sleep 10000)
  (logp :info "main sending finish message to from-kafka")
  (>!! chan true)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (run-it))
