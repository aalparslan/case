import React, { useState } from 'react';
import axios from 'axios';

function TextForm() {
  const [inputText, setInputText] = useState('');

  const handleTextSubmit = async () => {
    try {
      const response = await axios.post('http://localhost:8080/api/saveText', { text: inputText });
      console.log(response.data); // Success message from backend
    } catch (error) {
      console.error('Error sending text:', error);
    }
  };

  return (
    <div>
      <input
        type="text"
        value={inputText}
        onChange={(e) => setInputText(e.target.value)}
      />
      <button onClick={handleTextSubmit}>Submit</button>
    </div>
  );
}

export default TextForm;
