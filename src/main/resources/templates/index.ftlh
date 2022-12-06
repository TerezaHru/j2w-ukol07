[#ftl]

<h1>Seznam článků</h1>

[#list index.content]

    <table class="u-full-width">

        <td><b>Název článku</b></td>
        <td><b>Obsah</b></td>
        <td><b>Napsal</b></td>
        <td><b>Autor</b></td>
        <tbody>
        [#items as post]

        <tr>
            <td>${post.title}</td>
            <td>${post.perex}</td>
            <td>${post.published}</td>
            <td>${post.author}</td>
            <td><a href="/detail/${post.slug}">Přečíst</td>
        </tr>
        [/#items]
        </tbody>
    </table>
[#else]
    <div>Seznam je prázdný.</div>
[/#list]
<div class="totalCount">Celkem nalezeno ${index.totalElements} záznamů.</div>
