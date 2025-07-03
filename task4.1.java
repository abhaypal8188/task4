private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
    this.dispose(); // Close the homepage
    new LoginForm().setVisible(true); // Reopen the login form
}

