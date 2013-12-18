/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

var style_addr = "/icm/resources/style/";
var script_lib_addr = "/icm/resources/js/lib";

var styles = new Array();
styles[0] = "development_style.css";

var scripts = new Array();
scripts[0] = "jquery.loadTemplate-1.3.2.js";

$("document").ready(function() {
    loadScripts();
    loadstyles();   
    attacheHeader();
    attacheFooter();
});


function loadScripts() {
    for (var i = 0; i < scripts.length; i++) {
        if (!scriptExists(scripts[i])) {
            $("head").append("<script type='text/javascript' href='" + script_lib_addr + scripts[i] + "'> </script>");
        }
    }
}
function loadstyles() {
    for (var i = 0; i < styles.length; i++) {
        if (!styleExists(styles[i])) {
            $("head").append("<link rel='stylesheet' href='" + style_addr + styles[i] + "' type='text/css' />");
        }
    }
}
function attacheHeader() {
    $("header").remove();
    $("body").prepend("<header></header>");
    $("header").load("/icm/resources/html/header.html");
}
function attacheFooter() {
    $("footer").remove();
    $("body").append("<footer></footer>");
    $("footer").load("/icm/resources/html/footer.html");
}
function styleExists(link) {
    var b = false;
    $("link").each(function() {
        var arr = this.href.split("/");
        if (arr[arr.length - 1] === link) {
            b = true;
        }
    });
    return b;
}
function scriptExists(link) {
    var b = false;
    $("script").each(function() {
        var arr = this.src.split("/");
        if (arr[arr.length - 1] === link) {
            b = true;
        }
    });
    return b;
}