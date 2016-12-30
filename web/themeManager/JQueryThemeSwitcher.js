$.fn.themeswitcher = function () {
    $('.uiThemeSwitchButton').each(function ()
    {
        //alert('adding click logic');
        $(this).change(function () {
            updateCSS($(this).attr("jwtype"), $(this).attr("value"));
        });
    });
};

//function to append a new theme stylesheet with the new style changes
function updateCSS(locStr, className) {
    $('link.ui-theme').remove();
    var cssLink = '<link href="' + locStr + '" rel="stylesheet" type="text/css" class="CSSLink ui-theme">';
    $('head').append(cssLink);
    $('body').attr('class', $('body').attr('class') + ' ' + className);
 //   resizeLayouts();
}

//autoload dot luv
updateCSS('css/theming/ui_dotluv_theme.css','uidotluv');
