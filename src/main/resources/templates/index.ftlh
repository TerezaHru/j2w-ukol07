[#ftl]

<h1>Seznam článků</h1>

[#list index.content]
    <table border = "1">
        <thead>
        <tr>
        <th><b>Název článku</b></th>
        <th><b>Obsah</b></th>
        <th><b>Datum</b></th>
        <th><b>Autor</b></th>
        </tr>
        <tbody>
        [#items as post]

        <tr>
            <td>${(post.title)?no_esc}</td>
            <td>${(post.perex)?no_esc}</td>
            <td>${post.published}</td>
            <td>${(post.author)?no_esc}</td>
            <td><a href="/post/${post.slug}">Přečíst</td>
        </tr>
        [/#items]
        </tbody>
    </table>
[#else]
    <div>Seznam je prázdný.</div>
[/#list]
<div class="totalCount">Celkem nalezeno ${index.totalElements} záznamů.</div>
