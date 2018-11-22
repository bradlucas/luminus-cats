(ns user
  (:require [luminus-cats.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [luminus-cats.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'luminus-cats.core/repl-server))

(defn stop []
  (mount/stop-except #'luminus-cats.core/repl-server))

(defn restart []
  (stop)
  (start))


