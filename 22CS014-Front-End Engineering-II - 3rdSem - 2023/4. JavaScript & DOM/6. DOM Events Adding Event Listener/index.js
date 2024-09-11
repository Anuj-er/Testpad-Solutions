function changeParaText(event) {
	event.target.innerText = 'Yay! you added the event listener.'
}

// Start your code here ---->
const paragraph = document.querySelector('p');

// Adding the click event listener to the paragraph
paragraph.addEventListener('click', changeParaText);