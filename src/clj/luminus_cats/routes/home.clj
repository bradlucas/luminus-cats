(ns luminus-cats.routes.home
  (:require [luminus-cats.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]
            [luminus-cats.cats :as c]))

(defn home-page []
  (layout/render
    "home.html" {:home (-> "docs/home.md" io/resource slurp)}))

(defn about-page []
  (layout/render "about.html"))

(defn cats-page []
  (layout/render "cats.html" {:cats (c/get-links 5)}))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/cats" [] (cats-page))
  (GET "/about" [] (about-page)))

