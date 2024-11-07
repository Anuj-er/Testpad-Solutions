class DisplayContent extends React.Component {
    render() {
        const { content = "N/A" } = this.props; // Default value for content
        return (
            <p>{content}</p> // Render content inside a <p> element
        );
    }
}