[#ftl]
<h1>Seznam článků</h1>

[#list index.content]


        <body>
        [#items as post]

            ${post.author}
            ${post.title}
            ${post.perex}
            ${post.body}
        [/#items]
        </body>
    <div>Seznam je prázdný.</div>
[/#list]