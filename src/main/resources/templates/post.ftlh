[#ftl]
<!DOCTYPE html>
<html lang="cs">

    <head><b>Název článku</b></head>
    <body>
        <div>
            <div><b>${(post.title)?no_esc}</b></div>
            <div>${(post.perex)?no_esc}</div>
            <div>${post.published}</div>
            <div>${(post.author)?no_esc}</div>
        </div>
<br>
        <div><a href="/">Zpět na původní stránku</div>

    </body>

</html>

