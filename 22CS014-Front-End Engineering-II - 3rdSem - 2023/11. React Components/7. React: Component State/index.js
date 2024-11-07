class TextInput extends React.Component {
    constructor(props) {
      super(props);
      
      this.state = {
        value: '' // Initialize state
      };
  
      this.handleChange = this.handleChange.bind(this);
    }
  
    handleChange(event) {
      this.setState({ value: event.target.value }); // Update state with the input value
    }
  
    render() {
      return (
        <input value={this.state.value} onChange={this.handleChange} /> // Attach onChange event handler
      );
    }
  }