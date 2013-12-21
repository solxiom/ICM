/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//deepEqual is the best choice mostly
//asyncTest for asnyc functions
//expect(2) for number of assertions

module("group b: loader functions");
test("loader, correct file, fileExist Method", function() {
    var value = fileExists("link", "href", "standard_style.css");
    strictEqual(value, true, "We expect value to be true");
});
test("loader, wrong file, fileExist Method", function() {
    var value = fileExists("link", "href", "standard_style333.css");
    strictEqual(value, false, "We expect value to be false");
});
              