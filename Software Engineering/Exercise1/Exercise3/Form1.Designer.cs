namespace Exercise3
{
    partial class Enter
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.Birth = new System.Windows.Forms.Label();
            this.Gender = new System.Windows.Forms.Label();
            this.BornIn = new System.Windows.Forms.Label();
            this.txtName = new System.Windows.Forms.TextBox();
            this.txtBornIn = new System.Windows.Forms.TextBox();
            this.dateTimePicker = new System.Windows.Forms.DateTimePicker();
            this.checkBox1 = new System.Windows.Forms.CheckBox();
            this.checkBox2 = new System.Windows.Forms.CheckBox();
            this.LBName = new System.Windows.Forms.Label();
            this.btnAdd = new System.Windows.Forms.Button();
            this.btnReset = new System.Windows.Forms.Button();
            this.Link = new System.Windows.Forms.LinkLabel();
            this.SuspendLayout();
            // 
            // Birth
            // 
            this.Birth.AutoSize = true;
            this.Birth.Location = new System.Drawing.Point(30, 61);
            this.Birth.Name = "Birth";
            this.Birth.Size = new System.Drawing.Size(28, 13);
            this.Birth.TabIndex = 1;
            this.Birth.Text = "Birth";
            // 
            // Gender
            // 
            this.Gender.AutoSize = true;
            this.Gender.Location = new System.Drawing.Point(30, 109);
            this.Gender.Name = "Gender";
            this.Gender.Size = new System.Drawing.Size(42, 13);
            this.Gender.TabIndex = 2;
            this.Gender.Text = "Gender";
            // 
            // BornIn
            // 
            this.BornIn.AutoSize = true;
            this.BornIn.Location = new System.Drawing.Point(30, 149);
            this.BornIn.Name = "BornIn";
            this.BornIn.Size = new System.Drawing.Size(40, 13);
            this.BornIn.TabIndex = 3;
            this.BornIn.Text = "Born in";
            // 
            // txtName
            // 
            this.txtName.Location = new System.Drawing.Point(104, 14);
            this.txtName.Name = "txtName";
            this.txtName.Size = new System.Drawing.Size(200, 20);
            this.txtName.TabIndex = 4;
            // 
            // txtBornIn
            // 
            this.txtBornIn.Location = new System.Drawing.Point(104, 142);
            this.txtBornIn.Name = "txtBornIn";
            this.txtBornIn.Size = new System.Drawing.Size(200, 20);
            this.txtBornIn.TabIndex = 5;
            // 
            // dateTimePicker
            // 
            this.dateTimePicker.Location = new System.Drawing.Point(104, 55);
            this.dateTimePicker.Name = "dateTimePicker";
            this.dateTimePicker.Size = new System.Drawing.Size(200, 20);
            this.dateTimePicker.TabIndex = 6;
            // 
            // checkBox1
            // 
            this.checkBox1.AutoSize = true;
            this.checkBox1.Location = new System.Drawing.Point(104, 108);
            this.checkBox1.Name = "checkBox1";
            this.checkBox1.Size = new System.Drawing.Size(49, 17);
            this.checkBox1.TabIndex = 7;
            this.checkBox1.Text = "Male";
            this.checkBox1.UseVisualStyleBackColor = true;
            this.checkBox1.CheckedChanged += new System.EventHandler(this.checkBox1_CheckedChanged);
            // 
            // checkBox2
            // 
            this.checkBox2.AutoSize = true;
            this.checkBox2.CheckAlign = System.Drawing.ContentAlignment.TopLeft;
            this.checkBox2.Location = new System.Drawing.Point(159, 108);
            this.checkBox2.Name = "checkBox2";
            this.checkBox2.Size = new System.Drawing.Size(60, 17);
            this.checkBox2.TabIndex = 8;
            this.checkBox2.Text = "Female";
            this.checkBox2.UseVisualStyleBackColor = true;
            this.checkBox2.CheckedChanged += new System.EventHandler(this.checkBox2_CheckedChanged);
            // 
            // LBName
            // 
            this.LBName.AutoSize = true;
            this.LBName.Location = new System.Drawing.Point(30, 21);
            this.LBName.Name = "LBName";
            this.LBName.Size = new System.Drawing.Size(35, 13);
            this.LBName.TabIndex = 9;
            this.LBName.Text = "Name";
            // 
            // btnAdd
            // 
            this.btnAdd.Location = new System.Drawing.Point(104, 168);
            this.btnAdd.Name = "btnAdd";
            this.btnAdd.Size = new System.Drawing.Size(75, 23);
            this.btnAdd.TabIndex = 10;
            this.btnAdd.Text = "Add";
            this.btnAdd.UseVisualStyleBackColor = true;
            this.btnAdd.Click += new System.EventHandler(this.btnAdd_Click);
            // 
            // btnReset
            // 
            this.btnReset.Location = new System.Drawing.Point(229, 168);
            this.btnReset.Name = "btnReset";
            this.btnReset.Size = new System.Drawing.Size(75, 23);
            this.btnReset.TabIndex = 11;
            this.btnReset.Text = "Reset";
            this.btnReset.UseVisualStyleBackColor = true;
            this.btnReset.Click += new System.EventHandler(this.btnReset_Click);
            // 
            // Link
            // 
            this.Link.AutoSize = true;
            this.Link.Location = new System.Drawing.Point(30, 210);
            this.Link.Name = "Link";
            this.Link.Size = new System.Drawing.Size(84, 13);
            this.Link.TabIndex = 12;
            this.Link.TabStop = true;
            this.Link.Text = "0 student added";
            this.Link.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.Link_LinkClicked);
            // 
            // Enter
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(329, 241);
            this.Controls.Add(this.Link);
            this.Controls.Add(this.btnReset);
            this.Controls.Add(this.btnAdd);
            this.Controls.Add(this.LBName);
            this.Controls.Add(this.checkBox2);
            this.Controls.Add(this.checkBox1);
            this.Controls.Add(this.dateTimePicker);
            this.Controls.Add(this.txtBornIn);
            this.Controls.Add(this.txtName);
            this.Controls.Add(this.BornIn);
            this.Controls.Add(this.Gender);
            this.Controls.Add(this.Birth);
            this.MaximumSize = new System.Drawing.Size(345, 280);
            this.MinimumSize = new System.Drawing.Size(345, 280);
            this.Name = "Enter";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Enter Student";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label Birth;
        private System.Windows.Forms.Label Gender;
        private System.Windows.Forms.Label BornIn;
        private System.Windows.Forms.TextBox txtName;
        private System.Windows.Forms.TextBox txtBornIn;
        private System.Windows.Forms.DateTimePicker dateTimePicker;
        private System.Windows.Forms.CheckBox checkBox1;
        private System.Windows.Forms.CheckBox checkBox2;
        private System.Windows.Forms.Label LBName;
        private System.Windows.Forms.Button btnAdd;
        private System.Windows.Forms.Button btnReset;
        private System.Windows.Forms.LinkLabel Link;
    }
}

