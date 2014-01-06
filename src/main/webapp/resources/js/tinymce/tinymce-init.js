/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


tinyMCE.init({ 
//mode : "textareas",
//theme : "modern",
//theme_modern_buttons1_add_before : "separator,insertdate,inserttime,preview,zoom,separator,forecolor,backcolor",
//theme_modern_buttons2_add_before : "bullist,numlist,separator,outdent,indent,separator,undo,redo,separator,link,unlink,anchor,image,cleanup,help,code",
//theme_modern_buttons3_add_before : "hr,removeformat,visualaid,separator,sub,sup,separator,charmap"
    
        theme : "modern",
        mode : "exact",
    elements : "description_specialite",
//        mode : "textareas",
        // styles of the WYSIWYG content
        content_css : "/css/tiny_mce.css",
//        skin : "lightgray",
    skin : "o2k7"
});

//$Form->setAction($this->view->url(array('controller' => 'test', 'action' => 'blaat'), 'default', TRUE))