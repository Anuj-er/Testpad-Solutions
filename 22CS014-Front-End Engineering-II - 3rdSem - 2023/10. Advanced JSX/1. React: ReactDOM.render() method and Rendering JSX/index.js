const JSXElement = (<h1>Hi, There!</h1>);

function renderElements() {
    // Assuming you have a div with id 'root' in your HTML
    ReactDOM.render(JSXElement, document.getElementById('root'));
}