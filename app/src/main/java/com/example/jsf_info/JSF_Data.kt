package layout

import com.example.jsf_info.R

object JSF_Data {
    private val jsfNames = arrayOf("Angular",
        "React",
        "Vue.js",
        "Ember.js",
        "Meteor",
        "Mithril",
        "Node.js",
        "Polymer",
        "Aurelia",
        "Backbone.js")

    private val jsfDevelopers = arrayOf("Google",
        "Facebook",
        "Evan You",
        "Ember Core Team",
        "Meteor Development Group",
        "Mithril Dev Team",
        "Node.js Developer",
        "Google",
        "Aurelia Developer",
        "Jeremy Ashkenas")

    private val jsfInitialReleases = arrayOf("14 September 2016",
        "29 May 2013",
        "February 2014",
        "8 December 2011",
        "20 January 2012",
        "March 2014",
        "27 May 2009",
        "29 May 2015",
        "27 July 2016",
        "13 October 2010")

    private val jsfCurrentVersion = arrayOf("v8.2.4",
        "v16.9",
        "v2.6.10",
        "v3.12.0",
        "v1.8",
        "v2.0.4",
        "v12.10.0",
        "v3.3.0",
        "v1.3.1",
        "v1.4.0")

    private val jsfDescription = arrayOf("One of the most powerful, efficient, and open-source JavaScript frameworks is Angular. This framework is operated by Google and is basically implemented to use for developing Single Page Application (SPA). It extends the HTML into the application and interprets the attributes in order to perform data binding.",
        "Created by Facebook, React framework has earned popularity within a short period of time. In fact, it is used to develop and operate the dynamic User Interface of the web pages with high incoming traffic. It makes the use of a virtual DOM and hence, the integration of the same with any application is easier.",
        "Though developed in the year 2016, this JavaScript framework has already made its way into the market and has proven its worth by offering multifarious features. Its dual integration mode is one of the most attractive features for the creation of high-end SPA or Single Page Application. It is a much reliable platform for developing cross-platform.",
        "Ember.js was introduced to the software market in 2015 and since then, it has gained popularity with its wide application area. The features of Ember.js support two-way data binding and hence, establish a reliable platform for handling the complicated User Interfaces. Popular websites like LinkedIn, Netflix, Nordstrom and many more use the Ember.JS platform for their websites.",
        "The application area of Meteor (aka Meteor.js or MeteorJS) serves the name itself since it is varied as it covers almost the major portion of the software development. Back-end development, management of the database, business logic and rendering of the front-end part of the websites are a major area where Meteor framework is used.",
        "Mithril is a client-side JavaScript framework that is mainly used in developing the Single Page Applications. The implementation of the framework is easier since the functions are not derived from a base class. It’s small (< 8kb gzip), fast and provides routing and XHR utilities out of the box. It has a few features similar to React.",
        "Node.js is a server-side JavaScript run-time environment, which works on cross platforms and is open-source. The framework is capable of driving asynchronous I/O with its event-driven architecture. It works in the JavaScript Runtime environment and hence shows similar properties of JAVA like threading, packages, forming of loops.",
        "The polymer is an open-source JavaScript library developed by Google, which can create the elements of the website without going into the complex level. Also, it supports both, one-way and two-way data binding, hence making the application area wider.",
        "Aurelia framework is the latest version of the JavaScript, which can be used to implement any interface. It is actually the next generation of the framework for developing far more robust websites. The framework of Aurelia can extend the HTML for various purposes, including data binding. Also, its modern architecture ensures that the toll can be used for interpretation of both client-side and server-side at a time.",
        "It is one of the most famous JavaScript frameworks. It is very easy to understand and learn. It can be used to create Single Page Applications. This framework was made by keeping in mind the idea that all the server-side functions must flow through an API, which would help in achieving complex functionalities by writing less code.")

    private val jsfUrl = arrayOf("https://angular.io/",
        "https://reactjs.org/",
        "https://vuejs.org/",
        "https://emberjs.com/",
        "https://www.meteor.com/",
        "https://mithril.js.org/",
        "https://nodejs.org/en/",
        "https://www.polymer-project.org/",
        "https://aurelia.io/",
        "https://backbonejs.org/")

    private val jsfLogo = intArrayOf(R.drawable.angular,
        R.drawable.react,
        R.drawable.vue,
        R.drawable.ember,
        R.drawable.meteor,
        R.drawable.mithril,
        R.drawable.nodejs,
        R.drawable.polymer,
        R.drawable.aurelia,
        R.drawable.backbone)

    val listData: ArrayList<JSFrameworks>
        get() {
            val list = arrayListOf<JSFrameworks>()
            for (pos in jsfNames.indices) {
                val jsf = JSFrameworks()
                jsf.name = jsfNames[pos]
                jsf.developer = jsfDevelopers[pos]
                jsf.initial_release = jsfInitialReleases[pos]
                jsf.current_version = jsfCurrentVersion[pos]
                jsf.description = jsfDescription[pos]
                jsf.url = jsfUrl[pos]
                jsf.logo = jsfLogo[pos]
                list.add(jsf)
            }
            return list
        }

}