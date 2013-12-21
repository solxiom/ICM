/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
"use strict";

$("document").ready(function() {
    $("#main").css('visibility', 'hidden');
    setTimeout(1000, getMetaDataAndLoad());//better ui experience
    attachHeader();
    attachFooter();

});
function getRootPath() {
    var root_path = window.location.pathname;
    var arr = root_path.split("/");
    return arr[1];
}
function getResourcesRoot() {
    return window.location.protocol + "//" + window.location.host + "/" + getRootPath() + "/resources/";
}
function getMetaDataAndLoad() {
    var head_meta_path = getResourcesRoot() + "js/json/head_meta.json";
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
        if (this !== undefined && $(this).attr(attr_name) !== undefined) {
            var arr = $(this).attr(attr_name).split("/");
            if (arr[arr.length - 1] === filename) {
                b = true;
            }
        }
    });
    return b;
}
function buildPath(meta) {   
    var path = getResourcesRoot() + meta.path + meta.file;
    if (meta.local === "false") {
        path = meta.path + meta.file;
    }
    return path;
}


