document.getElementById("bookForm").addEventListener("submit", function (event) {
    const title = document.getElementById("title").value.trim();
    const author = document.getElementById("author").value.trim();
    const isbn = document.getElementById("isbn").value.trim();
    const quantity = document.getElementById("quantity").value.trim();

    if (!title || !author || !isbn || quantity <= 0) {
        event.preventDefault();
        alert("Please fill out all fields correctly.");
    }
});
