<h1>${u.username}</h1>

<#list items as item>
    <p>
        <span>${item.id}</span>
        <span>${item.id}</span>
        <img src="/images/${item.url}" alt="${item.name}" width="100"/>
    </p>
</#list>