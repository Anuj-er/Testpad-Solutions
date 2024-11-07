function JSXElement(toDoList) {
    return (
      <ol>
        {toDoList.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ol>
    );
  }