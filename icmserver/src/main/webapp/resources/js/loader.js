/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
"use strict";

var resources_root = window.location.pathname + "/resources/";
var head_meta_path = resources_root + "js/json/head_meta.json";

$("document").ready(function() {
    $("#main").css('visibility', 'hidden');
    setTimeout(1000,getMetaDataAndLoad());//better ui experience
    attachHeader();
    attachFooter();
    
});
function getMetaDataAndLoad() {
    $.ajax({
        async: "false",
        type: "GET",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        url: head_meta_path,
        success: function(data) {
            loadstyles(data.styles);
            loadFavicon(data.favicon);
            loadScripts(data.scripts);
            $("#main").css('visibility', 'visible');
        }
    });
}
function loadScripts(scripts) {
    $(scripts).each(function() {
        if (!fileExists("script", "src", this.file)) {
            var script_path = buildPath(this);
            $("head").append("<script type='text/javascript' src='" + script_path + "'> </script>");
        }
    });
}
function loadstyles(styles) {
    $(styles).each(function() {
        if (!fileExists("link", "href", this.file)) {
            var style_path = buildPath(this);
            $("head").append("<link rel='stylesheet' href='" + style_path + "' type='text/css' />");
        }
    });
}
function loadFavicon(favicon) {
    if (!fileExists("link", "href", favicon.file)) {
        var icon_path = buildPath(favicon);
        $("head").append("<link rel='icon' href='" + icon_path + "' type='image/png' />");
    }
}
function attachHeader() {
    $("header").remove();
    $("body").prepend("<header></header>");
    $("header").load("/icm/resources/html/header.html");
}
function attachFooter() {
    $("footer").remove();
    $("body").append("<footer></footer>");
    $("footer").load("/icm/resources/html/footer.html");
}
function fileExists(element_type, attr_name, filename) {
    var b = false;
    $(element_type).each(function() {
        var arr = $(this).attr(attr_name).split("/");
        if (arr[arr.length - 1] === filename) {
            b = true;
        }
    });
    return b;
}
function buildPath(meta) {
    var path = resources_root + meta.path + meta.file;
    if (meta.local === "false") {
        path = meta.path + meta.file;
    }
    return path;
}


