
function activate() {
//    $('.nav li.active').removeClass('active');
//    var $this = $(this);
//    if (!$this.hasClass('active')) {
//        $('.nav li').addClass('active');
//    }

}
//<script type = "text/javascript" >
function showcouleurs() {
//            $('#monlienhypertexte').click(function() {
//                alerte("Felixiano");
    $.ajax({
        url: 'couleurs/ajax1',
        success: function(response) {
            $('#contenu').html(response);
        }
//                });
    });
}


function show() {
//            $('#monlienhypertexte').click(function() {
//                alerte("Felixiano");
    var message = $('#message').val();
    $.ajax({
        url: 'couleurs/ajax',
        data: 'message=' + message,
        success: function(response) {
            $('.show-msg').html(response);
        }
//                });
    });
}


function save() {
//    if (confirm('Voulez vous sauvegarder cette couleur ?'))
//    {
    $.ajax({
        url: 'cou/couleurs/save',
        type: "GET",
        success: function(response) {
            $('#contenu').html(response);
        },
        failure: function() {
            alert('Echec de requette ajax');
        }
//                });
    });
//    }
}
function delcouleurs(id) {
//            $('#monlienhypertexte').click(function() {
//                alerte("Felixiano");
    if (confirm('Voulez vous supprimer cette couleur ?'))
    {

        $.ajax({
            url: 'couleurs/ajax1',
            type: "GET",
            data: 'id=' + id,
            success: function(response) {
                $('#contenu').html(response);
            }
//                });
        });
    }
}
function Rajaxdelete(id) {
//            $('#monlienhypertexte').click(function() {
//                alerte("Felixiano");
    if (confirm('Voulez-vous vraiment supprimer?'))
    {
        var url = "<?php echo $this->url(array('action' => 'ajaxdelete')); ?>"

        $.ajax({
            url: "contrat/ajaxdelete",
            type: "GET",
            data: 'id=' + id,
            success: function(response) {
                $('.display').html(response);
            }
//                });
        });
    }
}
function supmultiContrat() {
//            $('#monlienhypertexte').click(function() {
//                alerte("Felixiano");
    if (confirm('Voulez vous supprimer cette couleur ?'))
    {
        var selects = $('#selects').val();
        alert(selects);
        $.ajax({
            url: 'Contrat/supmulti',
            type: "GET",
            data: 'selects=' + selects,
            success: function(response) {
//                $('#contenu').html(response);
                alert('SUCCESS!!!!!!!!!!');
            },
            failure: function() {
                alert('Echec de requette ajax');
            }

//                });
        });
    }
}
function addcouleur() {
    $.ajax({
        url: 'couleurs/addcouleur',
        success: function(response) {
            $('#contenu').html(response);
        }
    });
}
function modcouleur(id) {
    $.ajax({
        url: 'couleurs/modcouleur',
        data: 'id=' + id,
        success: function(response) {
            $('#contenu').html(response);
        },
        failure: function() {
            alert('Echec de requette ajax');
        }
    });
}

function markAllRows(a) {
    $("#" + a).find("input:checkbox:enabled").attr("checked", "checked").parents("tr").addClass("marked");
    return true;
}
function unMarkAllRows(a) {
    $("#" + a).find("input:checkbox:enabled").removeAttr("checked").parents("tr").removeClass("marked");
    return true;
}

function tableSize(i) {
    $.ajax({
        url: 'contrat/reload',
        data: 'id=' + i,
        success: function(response) {
//            $("#choix").find("option").attr("selected", "selected").parents("select");
            $('.display').html(response);
        },
        failure: function() {
            alert('Echec de requette ajax');
        }
    });
}





$('document').ready(function() {
    ValidateAjax.initialize('formid', 'index/validateform');
});

ValidateAjax = {
    initialize: function(formid, endpoint) {
        end_url = endpoint;
        form_id = '#' + formid;
        $(form_id + ' input').blur(function() {
            var formElementID = $(this).attr('id');
            ValidateAjax.doValidate(formElementID);
            return false;
        });
    },
    doValidate: function(id) {
        var url = end_url;
        var data = $(form_id).serialize();
        $.post(url, data, function(response) {
            $('#' + id).parent().find('.errors').remove();
            if (response[id])
                $('#' + id).parent().append(ValidateAjax.getHTML(response[id]));
        }, 'json');
    },
    getHTML: function(errArray) {
        var o = '<ul class="errors">';
        $.each(errArray, function(key, value) {
            o += '<li>' + value + '</li>';
        });
        o += '</ul>';
        return o;
    }
};