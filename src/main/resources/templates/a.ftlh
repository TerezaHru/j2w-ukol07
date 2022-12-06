[#ftl]

<h1>Seznam článků</h1>

[#list a.content]

    <table class="u-full-width">

    <td><b>Název článku</b></td>
        <td><b>Vydáno</b></td>
        <tbody>
        [#items as post]

        <tr>
            <td><a href="/detail/${post.id}">${post.id}</a></td>
            <td>${post.title}</td>
            <td>${post.published}</td>

        </tr>
        [/#items]
        </tbody>
    </table>
[#else]
    <div>Seznam je prázdný.</div>
[/#list]
<div class="totalCount">Celkem nalezeno ${a.totalElements} záznamů.</div>
