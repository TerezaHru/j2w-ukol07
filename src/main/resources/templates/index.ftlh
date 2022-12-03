[#ftl]
<h1>Seznam článků</h1>

[#list index.content]

    <table class="u-full-width">
    <thead>
    <tr>
        <th>Název článku</th>

    </tr>
    </thead>
        <tbody>
        [#items as post]
        <tr>

            <td>${post.title}</td>

        </tr>
        [/#items]
        </tbody>
    </table>
[#else]
    <div>Seznam je prázdný.</div>
[/#list]
<div class="totalCount">Celkem nalezeno ${index.totalElements} záznamů.</div>