package com.sfpd.java.simpleBot.doc;

public class Frameworks {
    /** WHAT ARE FRAMEWORKS?
     *  A framework is a universal, reusable piece of software that facilitates the
     *  development of typical applications or their parts. It consists of
     *  structured code templates and provides generic functionality which can be
     *  easily extended for the needs of a specific application. To relinquish
     *  control on low-level tasks and focus on high-level problems, you should
     *  use the API provided by the framework. It can significantly reduce total
     *  development time.
     */
    /** FRAMEWORKS VS LIBRARIES
     *  A framework serves as the skeleton of an application or its parts and sets
     *  "the rules of the game".
     *  A library only provides some specific operations without having such a global
     *  influence.
     *  However, libraries can be provided as parts of frameworks.
     */
    /** INVERSION OF CONTROL
     *  The most common principle that comes with frameworks = Inversion of Control (loC)
     *  The Framework calls your code and your code calls the library.
     *  A framework provides templates for solving possible tasks and the interaction
     *  between the templates has been defined by developers of the framework.
     *  The user of a framework just takes the templates and extends them with
     *  application-specific code.
     */
    /** ADVANTAGES AND DISADVANTAGES
     *  Advantages:
     *      rapid prototyping and development
     *      standardization of project structures: its is easier to understand
     *          similar projects with the same structure
     *      wide use in companies around the world
     *      bug fixes and security updates by the authors
     *      a well-designed skeleton: as a rule, frameworks use up-to-date practices
     *          and patterns to provide a firm skeleton for applications.
     *  Disadvantages:
     *      selecting an unsuitable framework can make an application harder to
     *          implement.
     *      application slowdown: frameworks often do a lot of heavyweight things
     *          hidden from programmers
     *      it is difficult to replace a no longer suitable framework with
     *          another one while libraries can be easily replaced
     *      you may encounter a bug in the framework which may affect your work
     */
    /** HOW TO CHOOSE FRAMEWORKS
     *      Pay attention to well-known frameworks with good documentation. This
     *          will greatly simplify the use and allow you to easily find
     *          developers already familiar with this framework.
     *      If you wite a small application that will most probably never change,
     *          you can develop it without frameworks. Consider the use of the
     *          so-called lightweight frameworks or choose a framework only for
     *          some part(s) of your application.
     */
}
