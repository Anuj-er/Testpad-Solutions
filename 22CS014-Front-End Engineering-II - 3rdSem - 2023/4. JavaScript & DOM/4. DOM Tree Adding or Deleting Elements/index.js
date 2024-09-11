function addDivWithSpans() {
    const div = document.createElement('div');
    div.id = 'my-div';
  
    for (let i = 1; i <= 3; i++) {
      const span = document.createElement('span');
      span.textContent = `This is span ${i}.`;
      div.appendChild(span);
    }
  
    document.body.appendChild(div);
  }
  
  function removeParagraphs() {
    const paragraphs = document.getElementsByTagName('p');
    
    while (paragraphs.length > 0) {
      paragraphs[0].parentNode.removeChild(paragraphs[0]);
    }
  }