namespace Exercise3
{
    partial class Form2
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
            this.student = new System.Windows.Forms.Label();
            this.chooseStudents = new System.Windows.Forms.ComboBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.lbName = new System.Windows.Forms.Label();
            this.lbBirth = new System.Windows.Forms.Label();
            this.lbGender = new System.Windows.Forms.Label();
            this.lbBI = new System.Windows.Forms.Label();
            this.btnE = new System.Windows.Forms.Button();
            this.btnI = new System.Windows.Forms.Button();
            this.txtPath = new System.Windows.Forms.TextBox();
            this.btnImport = new System.Windows.Forms.Button();
            this.label5 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // student
            // 
            this.student.AutoSize = true;
            this.student.Location = new System.Drawing.Point(21, 18);
            this.student.Name = "student";
            this.student.Size = new System.Drawing.Size(44, 13);
            this.student.TabIndex = 0;
            this.student.Text = "Student";
            // 
            // chooseStudents
            // 
            this.chooseStudents.FormattingEnabled = true;
            this.chooseStudents.Location = new System.Drawing.Point(99, 15);
            this.chooseStudents.Name = "chooseStudents";
            this.chooseStudents.Size = new System.Drawing.Size(200, 21);
            this.chooseStudents.TabIndex = 1;
            this.chooseStudents.SelectedIndexChanged += new System.EventHandler(this.chooseStudents_SelectedIndexChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(21, 70);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 13);
            this.label1.TabIndex = 2;
            this.label1.Text = "Name";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(21, 105);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(28, 13);
            this.label2.TabIndex = 3;
            this.label2.Text = "Birth";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(21, 142);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(42, 13);
            this.label3.TabIndex = 4;
            this.label3.Text = "Gender";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(21, 178);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(40, 13);
            this.label4.TabIndex = 5;
            this.label4.Text = "Born in";
            // 
            // lbName
            // 
            this.lbName.AutoSize = true;
            this.lbName.Location = new System.Drawing.Point(96, 70);
            this.lbName.Name = "lbName";
            this.lbName.Size = new System.Drawing.Size(35, 13);
            this.lbName.TabIndex = 6;
            this.lbName.Text = "Name";
            // 
            // lbBirth
            // 
            this.lbBirth.AutoSize = true;
            this.lbBirth.Location = new System.Drawing.Point(96, 105);
            this.lbBirth.Name = "lbBirth";
            this.lbBirth.Size = new System.Drawing.Size(28, 13);
            this.lbBirth.TabIndex = 7;
            this.lbBirth.Text = "Birth";
            // 
            // lbGender
            // 
            this.lbGender.AutoSize = true;
            this.lbGender.Location = new System.Drawing.Point(96, 142);
            this.lbGender.Name = "lbGender";
            this.lbGender.Size = new System.Drawing.Size(42, 13);
            this.lbGender.TabIndex = 8;
            this.lbGender.Text = "Gender";
            // 
            // lbBI
            // 
            this.lbBI.AutoSize = true;
            this.lbBI.Location = new System.Drawing.Point(96, 178);
            this.lbBI.Name = "lbBI";
            this.lbBI.Size = new System.Drawing.Size(40, 13);
            this.lbBI.TabIndex = 9;
            this.lbBI.Text = "Born in";
            // 
            // btnE
            // 
            this.btnE.Location = new System.Drawing.Point(99, 206);
            this.btnE.Name = "btnE";
            this.btnE.Size = new System.Drawing.Size(75, 23);
            this.btnE.TabIndex = 10;
            this.btnE.Text = "Export CSV";
            this.btnE.UseVisualStyleBackColor = true;
            this.btnE.Click += new System.EventHandler(this.btnE_Click);
            // 
            // btnI
            // 
            this.btnI.Location = new System.Drawing.Point(224, 206);
            this.btnI.Name = "btnI";
            this.btnI.Size = new System.Drawing.Size(75, 23);
            this.btnI.TabIndex = 11;
            this.btnI.Text = "Import CSV";
            this.btnI.UseVisualStyleBackColor = true;
            this.btnI.Click += new System.EventHandler(this.btnI_Click);
            // 
            // txtPath
            // 
            this.txtPath.Location = new System.Drawing.Point(99, 267);
            this.txtPath.Name = "txtPath";
            this.txtPath.Size = new System.Drawing.Size(200, 20);
            this.txtPath.TabIndex = 12;
            // 
            // btnImport
            // 
            this.btnImport.Location = new System.Drawing.Point(99, 293);
            this.btnImport.Name = "btnImport";
            this.btnImport.Size = new System.Drawing.Size(200, 23);
            this.btnImport.TabIndex = 13;
            this.btnImport.Text = "Import";
            this.btnImport.UseVisualStyleBackColor = true;
            this.btnImport.Click += new System.EventHandler(this.btnImport_Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(96, 251);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(77, 13);
            this.label5.TabIndex = 14;
            this.label5.Text = "Enter the path:";
            // 
            // Form2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(329, 331);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.btnImport);
            this.Controls.Add(this.txtPath);
            this.Controls.Add(this.btnI);
            this.Controls.Add(this.btnE);
            this.Controls.Add(this.lbBI);
            this.Controls.Add(this.lbGender);
            this.Controls.Add(this.lbBirth);
            this.Controls.Add(this.lbName);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.chooseStudents);
            this.Controls.Add(this.student);
            this.MaximumSize = new System.Drawing.Size(345, 370);
            this.MinimumSize = new System.Drawing.Size(345, 39);
            this.Name = "Form2";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form2";
            this.Load += new System.EventHandler(this.Form2_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label student;
        private System.Windows.Forms.ComboBox chooseStudents;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label lbName;
        private System.Windows.Forms.Label lbBirth;
        private System.Windows.Forms.Label lbGender;
        private System.Windows.Forms.Label lbBI;
        private System.Windows.Forms.Button btnE;
        private System.Windows.Forms.Button btnI;
        private System.Windows.Forms.TextBox txtPath;
        private System.Windows.Forms.Button btnImport;
        private System.Windows.Forms.Label label5;
    }
}