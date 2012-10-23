<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title><g:layoutTitle default="RMS"/></title>
    <meta content="target-densitydpi=device-dpi, width=device-width, initial-scale=1.0, maximum-scale=1">

    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
    <link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
    <link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">

    <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <r:require module="metro"/>
    <g:layoutHead/>
    <r:layoutResources/>
</head>

<body>
    <g:render template="/layouts/globaltopnav"/>

    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span2">
                <g:render template="sidenav"/>
            </div>
            <div class="span10">
                <g:layoutBody/>
            </div>
        </div>

        <div class="row-fluid">
            <div class="span12">
                <div class="header-bar">
                    <hr/>
                    <a href="mailto:jmcmahan@resortmanagementsystem.com">Resort Management Systems</a>
                </div>
            </div>
        </div>
    </div>

    <g:javascript src="application.js"/>
    <r:layoutResources/>
</body>
</html>
