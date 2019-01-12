# luminus-cats

A sample application generated with Luminus which demonstrates it's
support for building RESTful web services.

Why?

Chapter Six of `Web Development with Clojure` has a sample application
which demonstrates how to use Compojure-API to build a RESTful
service. The example includes the ClojureScript profile to demonstrate
calling an API.

I thought it useful to rebuild the example without the ClojureScript
support to keep the Compojure-API example portion separate and more
easy to understand.

So, this project is essentially the book's Chapter 6 example without
the ClojureScript front-end.

I suggest if you find this project that you read Chapter Six of `Web
Development with Clojure` first.

## Setup

- Copy dev-config.edn.example to dev-config.edn
- Request an API key from the Cats API site. [https://thecatapi.com/](https://thecatapi.com/)
- Add your API key value to :api-key in dev-config.edn

## Running

To start run

    lein run 

## License

Copyright © 2019 Brad Lucas

