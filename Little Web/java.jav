let likeButton = document.getElementById('like-button');
let likeCount = document.getElementById('like-count');
let heart = document.getElementById('heart');

likeButton.addEventListener('click', () => {
    let count = parseInt(likeCount.innerText);
    likeCount.innerText = count + 1;

    heart.classList.toggle('liked');
});
