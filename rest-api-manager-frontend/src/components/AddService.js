import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';

export default function AddService() {
    return (
        <Container>
            <Box
                component="form"
                sx={{
                    '& > :not(style)': { m: 1, width: '25ch' },
                }}
                noValidate
                autoComplete="off"
            >
                <h1>Add New Rest Service</h1>
                <TextField id="outlined-basic" label="Service Name" variant="outlined" fullWidth />
                <TextField id="outlined-basic" label="URL" variant="filled" fullWidth />
            </Box>
        </Container>
    );
}
