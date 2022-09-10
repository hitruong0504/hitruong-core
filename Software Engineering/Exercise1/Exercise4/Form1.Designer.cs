namespace Exercise4
{
    partial class Form1
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
            this.label1 = new System.Windows.Forms.Label();
            this.txtURL = new System.Windows.Forms.TextBox();
            this.btnDL = new System.Windows.Forms.Button();
            this.richtb = new System.Windows.Forms.RichTextBox();
            this.lbDownload = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(40, 28);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(48, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "File Path";
            // 
            // txtURL
            // 
            this.txtURL.Location = new System.Drawing.Point(43, 44);
            this.txtURL.Name = "txtURL";
            this.txtURL.Size = new System.Drawing.Size(311, 20);
            this.txtURL.TabIndex = 1;
            // 
            // btnDL
            // 
            this.btnDL.Location = new System.Drawing.Point(43, 105);
            this.btnDL.Name = "btnDL";
            this.btnDL.Size = new System.Drawing.Size(97, 23);
            this.btnDL.TabIndex = 2;
            this.btnDL.Text = "Download";
            this.btnDL.UseVisualStyleBackColor = true;
            this.btnDL.Click += new System.EventHandler(this.button1_Click);
            // 
            // richtb
            // 
            this.richtb.Location = new System.Drawing.Point(43, 172);
            this.richtb.Name = "richtb";
            this.richtb.Size = new System.Drawing.Size(311, 137);
            this.richtb.TabIndex = 3;
            this.richtb.Text = "";
            // 
            // lbDownload
            // 
            this.lbDownload.AutoSize = true;
            this.lbDownload.Location = new System.Drawing.Point(40, 156);
            this.lbDownload.Name = "lbDownload";
            this.lbDownload.Size = new System.Drawing.Size(124, 13);
            this.lbDownload.TabIndex = 4;
            this.lbDownload.Text = "0 download(s) in process";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(389, 321);
            this.Controls.Add(this.lbDownload);
            this.Controls.Add(this.richtb);
            this.Controls.Add(this.btnDL);
            this.Controls.Add(this.txtURL);
            this.Controls.Add(this.label1);
            this.MaximumSize = new System.Drawing.Size(405, 360);
            this.MinimumSize = new System.Drawing.Size(405, 360);
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtURL;
        private System.Windows.Forms.Button btnDL;
        private System.Windows.Forms.RichTextBox richtb;
        private System.Windows.Forms.Label lbDownload;
    }
}

