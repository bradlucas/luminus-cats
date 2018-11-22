(ns luminus-cats.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[luminus-cats started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[luminus-cats has shut down successfully]=-"))
   :middleware identity})
