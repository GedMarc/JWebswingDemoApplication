function loadNewSourceCode(className)
{
    var url = 'java/' + className + '.java';
    $.get(url, function (data) {
        $("#sourceCode").html(data);
        //$("#sourceCode").visible(true);
        $('.prettyprinted').removeClass("prettyprinted");
        
        prettyPrint();
        //alert('loaded new source code');
    });
   // resizeLayouts();
}

function loadNewSourceCodeIntoDisplay(className,sourceCodeDisplay)
{
    var url = 'java/' + className + '.java';
    $.get(url, function (data) {
        $("#" + sourceCodeDisplay).html(data);
        //$("#sourceCode").visible(true);
        $('.prettyprinted').removeClass("prettyprinted");
        prettyPrint();
    });
  //  resizeLayouts();
}

$.fn.sourceCodeSwitcher = function () {
    $(this).children('*').each(function ()
    {
        $(this).click(function () {
           // alert('Called new load source code');
            loadNewSourceCode($(this).attr("value"));
            //$( "#sourceDialogWindow" ).dialog( "open" );
        });
    });
};

$.fn.sourceCodeThemeSwitcher = function () {
        $(this).on( "selectmenuselect", function( event, ui ) {
            updatePrettifyCSS(ui.item.value);
        });
};

//function to append a new theme stylesheet with the new style changes
function updatePrettifyCSS(locStr) {
    $('link.prettify').remove();
    var cssLink = '<link href="' + locStr + '" rel="stylesheet" type="text/css" class="CSSLink prettify">';
    $('head').append(cssLink);
    prettyPrint();
   // resizeLayouts();
}
