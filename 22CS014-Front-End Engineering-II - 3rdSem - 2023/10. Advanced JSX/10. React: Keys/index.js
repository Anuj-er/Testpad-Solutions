function JSXElement(items) {
    return (
      <div>
        {
          items.map(el => <span key={el.id}>{el.text}</span>)
        }
      </div>
    );
  }